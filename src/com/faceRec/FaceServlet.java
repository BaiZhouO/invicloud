package com.faceRec;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Base64;
@WebServlet(name = "FaceServlet")
public class FaceServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String imgString=request.getParameter("imgString");
        System.out.println(imgString);
        byte[] buff=Base64ToByteArr(imgString);
        try {
            FaceUtil.checkFace(buff);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("get!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    final Base64.Decoder decoder = Base64.getDecoder();
    public byte[] Base64ToByteArr(String b64)
    {
        String[] strArr=b64.split(",");
        return decoder.decode(strArr[1]);
    }

}
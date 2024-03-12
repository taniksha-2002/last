package com.example.chart.Controller;

import java.io.File;

public class fileExists {
    public static void main(String[] args) {
       /* String filePath = "chart.png";

        File file = new File(filePath);

        System.out.println("Absolute Path: " + file.getAbsolutePath());

        File directory= new File("C:\\Users\\MGSUser\\Downloads\\chart\\chart\\chart.png");
        if (!directory.exists()){
            directory.mkdirs();
        }

        if (file.exists()){
            System.out.println("File Exists:" + filePath);
        } else{
            System.out.println("File does not exist:" + filePath);
        }
    }
    */

        String directoryPath = "C:\\\\Users\\\\MGSUser\\\\Downloads\\\\chart\\\\chart\\\\chart.png";
        File directory = new File(directoryPath);

        String filePath = "chart.png";
        File file = new File(filePath);
        System.out.println("Absolute Path: " + file.getAbsolutePath());

        File path = new File("C:\\Users\\MGSUser\\Downloads\\chart\\chart\\chart.png");
        if (!path.exists()){
            path.mkdirs();
        }

        if (file.exists()){
            System.out.println("File Exists: " + filePath);
        } else{
            System.out.println("File does not exist: " + filePath);
        }

        if(directory.canRead()){
            System.out.println("Read permission: yes");
        } else{
            System.out.println("Read permission: no");
        }

        if(directory.canWrite()){
            System.out.println("Write permission: yes");
        } else{
            System.out.println(("Write permission: no"));
        }
    }
}


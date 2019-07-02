package com.sdjictec.bqdrtime.rtimedata.utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;



import java.io.*;

public class shellTool {
    private static final Logger logger = LoggerFactory.getLogger(shellTool.class);
    private static final int TIME_OUT = 1000 * 5 * 60;

    public static void runShellCommand(String command){
        try {
            Process process = Runtime.getRuntime().exec(command);
            BufferedInputStream bis = new BufferedInputStream(
                    process.getInputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(bis));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor();
            if (process.exitValue() != 0) {
                System.out.println("error!");
            }

            bis.close();
            br.close();
        } catch (IOException e) {

            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void writeProp(String command){
        String profilepath = PropsUtils.class.getResource("/crontabShell.sh").getPath();//我的配置文件在src根目录下
        try {
            FileWriter writer = new FileWriter(profilepath, false);
            writer.write(command);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("因未找到文件，写入失败！");
        }
    }


}

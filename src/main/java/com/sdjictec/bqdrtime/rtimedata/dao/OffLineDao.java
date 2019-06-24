package com.sdjictec.bqdrtime.rtimedata.dao;

import com.sdjictec.bqdrtime.rtimedata.utils.PropsUtils;
import com.sdjictec.bqdrtime.rtimedata.utils.shellTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/*
*@Description:
*使用shell命令对ElasticSearch进行清表
*/
public class OffLineDao{
        private static final Logger logger = LoggerFactory.getLogger(OffLineDao.class);

    public static void clearType(String table){

        //拼出一个清空表的shell命令
        String index_type = table.replace("|","/");
        String command = "0 4 * * *  curl -POST 'http://10.1.91.164:9200/"+index_type+"  _delete_by_query' -d '{ \"query\": { \"match_all\": {}}}'";
        //将shell命令写入一个文件中
        String profilepath = PropsUtils.class.getResource("/crontabShell.sh").getPath();
        System.out.println(profilepath);
        shellTool.runShellCommand("sh "+profilepath+" "+command);




    }
    public static void runOffLine(int jobid){
        String path = PropsUtils.class.getResource("/OffLine_as400_Extract_ElasticSearch.jar").getPath();
        String command = "10 4 * * *  java -jar "+path+" '"+jobid+"'";
        //将shell命令写入一个文件中
        String shPath = PropsUtils.class.getResource("/crontabShell.sh").getPath();
        shellTool.runShellCommand("sh "+shPath+" "+command);






    }

//    public static void main(String[] args) {
//        clearType("index/type");
//    }

}

package com.tank.gmall.manager.controller;

import com.tank.gmall.web.util.UploadUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/6/5 21:40
 * @Version: 1.0
 */

@RestController
public class FileUploadController {

/*    @PostMapping("/fileUpload")
    public String fileUpload(@RequestParam("file") MultipartFile[] files){
        if(files.length!=0){
            System.out.println("multipartFile = " + files[0].getName()+"|"+files[0].getSize());
        }
        return "https://m.360buyimg.com/babel/jfs/t5137/20/1794970752/352145/d56e4e94/591417dcN4fe5ef33.jpg";
    }*/
    @PostMapping("/fileUpload")
    public String fileUpload(@RequestParam("file") MultipartFile file){
        //上传图片,保存到指定目录
        String imag = UploadUtil.QI_PATH + UploadUtil.uploadQiniuyun(file);
        return imag;
    }
}

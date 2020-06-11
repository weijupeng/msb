package com.wjp.msb.web;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.wjp.msb.common.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author wjp
 * @date 2020/5/11 15:51
 */
@RestController
public class ImportController {
    private String importFileDir = System.getProperty("java.io.tmpdir");

    @PostMapping("/import")
    public Result importExcel(@RequestParam("file") MultipartFile file) throws Exception {

//        String destFilePath = String.format("%s/%s.%s",
//                importFileDir,
//                DateUtil.dateToString(new Date(), DateUtil.DATE_PATTERN_YYMMDD),
//                file.getOriginalFilename());
//        String fileAddress = destFilePath.replace("\\", "/")
//                .replaceAll("/+", "/");
//        File filename = new File(fileAddress);
//        InputStream inputStream = new FileInputStream(filename);
        ImportParams params = new ImportParams();
        params.setHeadRows(1);
        List<Object> objects = ExcelImportUtil.importExcel(file.getInputStream(), User.class, params);
        System.out.println("objects = " + objects);
        return Result.successResult(objects);
    }
}

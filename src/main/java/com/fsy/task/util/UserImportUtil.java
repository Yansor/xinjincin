package com.fsy.task.util;

import com.fsy.task.domain.ImportUser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserImportUtil {

    public static List<ImportUser>  getImportUserList(String filePath) throws IOException {
        List<ImportUser> users = new ArrayList<ImportUser>();
        BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));
        String line = null;
        while((line = br.readLine()) != null){
            users.add(ImportUser.builder()
                    .username(line.split(",")[0])
                    .password(line.split(",")[1])
                    .schoolToken(line.split(",")[2])
                    .build());
        }
        return users;
    }
}

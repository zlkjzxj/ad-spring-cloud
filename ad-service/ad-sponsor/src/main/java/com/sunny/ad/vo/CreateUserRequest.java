package com.sunny.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * @Description TODO
 * @Author sunny
 * Date 2019\2\20 0020 17:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
    private String userName;

    public boolean validate() {
        return !StringUtils.isEmpty(userName);
    }
}

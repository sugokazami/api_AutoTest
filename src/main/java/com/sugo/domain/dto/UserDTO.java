package com.sugo.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * Created by sugo on 2018/12/9.
 */

@Data
public class UserDTO {
    /**
     * 用户id
     */
    private String id ;

    /**
     * 用户名
     */
    @JsonProperty("username")
    private String userName ;

    /**
     * 用户昵称
     */
    @JsonProperty("nickname")
    private String nickName ;

    /**
     * 用户头像
     */
    @JsonProperty("faceimage")
    private String faceImage ;


    /**
     * token
     */
    private String token ;

}

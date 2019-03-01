package com.sunny.ad.sender;


import com.sunny.ad.mysql.dto.MySqlRowData;

/**
 * Created by Qinyi.
 */
public interface ISender {

    void sender(MySqlRowData rowData);
}

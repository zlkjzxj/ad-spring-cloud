package com.sunny.ad.mysql.listener;


import com.sunny.ad.mysql.dto.BinlogRowData;

/**
 * Created by Qinyi.
 */
public interface Ilistener {

    void register();

    void onEvent(BinlogRowData eventData);
}

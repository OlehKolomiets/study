package com.oyster.app.model;

import com.oyster.dao.annotation.Primary;
import com.oyster.dao.annotation.Stored;
import com.oyster.dao.annotation.utils.converter.LongConverter;

/**
 * @author bamboo
 * @since 4/15/14 11:03 PM
 */

@Stored(name = "ADMIN_TBL")
public class Admin {
    @Primary
    @Stored(name = "_id", converter = LongConverter.class)
    private long id;

    @Stored(name = "worker_info_id", converter = LongConverter.class)
    private long workerInfoId;

    public Admin(long id, long workerInfoId) {
        this.id = id;
        this.workerInfoId = workerInfoId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getWorkerInfoId() {
        return workerInfoId;
    }

    public void setWorkerInfoId(long workerInfoId) {
        this.workerInfoId = workerInfoId;
    }
}

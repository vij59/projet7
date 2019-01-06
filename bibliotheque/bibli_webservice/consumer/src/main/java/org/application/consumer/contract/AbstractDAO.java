package org.application.consumer.contract;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;
import javax.sql.DataSource;

public abstract class AbstractDAO {

    @Autowired
    @Named
    private DataSource dataSource;


    protected DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

}
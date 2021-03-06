package com.oyster.app.model;

import com.oyster.dao.annotation.Primary;
import com.oyster.dao.annotation.Stored;
import com.oyster.dao.annotation.utils.converter.IntConverter;
import com.oyster.dao.annotation.utils.converter.UUIDConverter;

import java.util.UUID;

/**
 * Class represents __Administrator in the system
 *
 * @author bamboo
 * @since 4/8/14 12:01 AM
 */
@Stored(name = "ADMINISTRATOR")
public class __Administrator {

    @Stored(name = "_ID", converter = UUIDConverter.class)
    @Primary
    private UUID id;

    @Stored(name = "NAME")
    private String name;

    @Stored(name = "USERNAME")
    private String username;

    @Stored(name = "EMAIL")
    private String email;

    @Stored(name = "PASSWORD")
    private String password;

    @Stored(name = "POSITION_ID", converter = UUIDConverter.class)
    private UUID positionId;

    @Stored(name = "AGE", converter = IntConverter.class)
    private int age;

    /**
     * default constructor
     */
    public __Administrator() {
    }


    /**
     * create __Administrator with all fields defined
     *
     * @param id
     * @param name
     * @param username
     * @param email
     * @param password
     * @param positionId
     * @param age
     */
    public __Administrator(UUID id, String name, String username, String email, String password, UUID positionId, int age) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.positionId = positionId;
        this.age = age;
    }

    /**
     * @return UUID of the __Administrator
     */
    public UUID getId() {
        return id;
    }

    /**
     * set UUID of the __Administrator
     *
     * @param id
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * @return name of the __Administrator
     */
    public String getName() {
        return name;
    }

    /**
     * set name of the __Administrator
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return username  of the __Administrator
     */
    public String getUsername() {
        return username;
    }

    /**
     * set username  of the __Administrator
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return email  of the __Administrator
     */
    public String getEmail() {
        return email;
    }

    /**
     * set email  of the __Administrator
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return password  of the __Administrator
     */
    public String getPassword() {
        return password;
    }

    /**
     * set password  of the __Administrator
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return Positions id  of the __Administrator
     */
    public UUID getPositionId() {
        return positionId;
    }

    /**
     * set Positions id  of the __Administrator
     *
     * @param positionId
     */
    public void setPositionId(UUID positionId) {
        this.positionId = positionId;
    }

    /**
     * @return age  of the __Administrator
     */
    public int getAge() {
        return age;
    }

    /**
     * set age  of the __Administrator
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}

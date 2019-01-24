package com.gd.logs.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-01-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LogsVideoDelete implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long videoId;

    private String deleteUrl;

    private LocalDateTime deleteTime;


}

package com.stackroute.muzixApp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Track {
    //@Id IS FOR PRIMARY KEY DECLARATION AND FOLLOWING 3 ARE THE FIELDS FOR DOMAIN USER TRACK

    @Id
    private int trackID;
    private String trackName;
    private String trackComments;

}

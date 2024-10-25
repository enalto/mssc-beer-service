package com.enalto.springframework.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Beer {

    @Id
    @UuidGenerator(style = UuidGenerator.Style.AUTO)
    @Column(length = 36, nullable = false, updatable = false, unique = true, columnDefinition = "varchar")
    private UUID id;

    @Version
    private Long version;

    @CreationTimestamp
    private Timestamp createdDate;

    @UpdateTimestamp
    private Timestamp lastUpdatedDate;
    private String beerName;
    private String beerStyle;

    @Column(unique = true, nullable = false)
    private Long upc;
    private BigDecimal price;
    private int minOnhand;
    private int quantityToBrew;
}


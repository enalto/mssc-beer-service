package com.enalto.springframework.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Beer {

    @Id
    @UuidGenerator(style = UuidGenerator.Style.AUTO)
    @Column(length = 36, nullable = false, updatable = false, unique = true, columnDefinition = "varchar")
    private UUID id;

    @Version
    private Long version;

  //  @CreationTimestamp
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp createdDate;

  //  @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp lastUpdatedDate;

    private String beerName;
    private String beerStyle;

    @Column(unique = true, nullable = false)
    private Long upc;

    private BigDecimal price;
    private int minOnhand;
    private int quantityToBrew;
}


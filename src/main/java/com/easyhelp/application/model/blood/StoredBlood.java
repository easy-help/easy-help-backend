package com.easyhelp.application.model.blood;

import com.easyhelp.application.model.BaseEntity;
import com.easyhelp.application.model.locations.DonationCenter;
import com.easyhelp.application.model.users.Donor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "stored_bloods")
public class StoredBlood extends BaseEntity {
    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_donor")
    private Donor donor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_donation_center")
    private DonationCenter donationCenter;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_blood_type")
    private SeparatedBloodType separatedBloodType;

    private Integer amount;
    private Date storedDate;
}

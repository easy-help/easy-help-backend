package com.easyhelp.application.model.users;

import com.easyhelp.application.model.locations.DonationCenter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "donation_center_personnels")
public class DonationCenterPersonnel extends PartnerUser {

    @ManyToOne(optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_donation_center")
    private DonationCenter donationCenter;
}

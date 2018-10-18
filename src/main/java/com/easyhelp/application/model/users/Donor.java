package com.easyhelp.application.model.users;

import com.easyhelp.application.model.blood.BloodType;
import com.easyhelp.application.model.blood.StoredBlood;
import com.easyhelp.application.model.donations.Donation;
import com.easyhelp.application.model.donations.DonationBooking;
import com.easyhelp.application.model.donations.DonationForm;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "donors")
public class Donor extends User {

    @OneToOne(mappedBy = "donor")
    private DonationForm donationForm;

    @OneToMany(mappedBy = "donor", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Donation> donations;

    @OneToOne(mappedBy = "donor")
    private DonationBooking donationBooking;

    @ManyToOne
    @JoinColumn(name = "fk_blood_type")
    private BloodType bloodType;


    @OneToMany(mappedBy = "donor", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<StoredBlood> storedBloodSet;
}

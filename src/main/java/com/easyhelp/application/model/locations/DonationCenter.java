package com.easyhelp.application.model.locations;


import com.easyhelp.application.model.blood.StoredBlood;
import com.easyhelp.application.model.donations.Donation;
import com.easyhelp.application.model.donations.DonationBooking;
import com.easyhelp.application.model.requests.DonationRequest;
import com.easyhelp.application.model.users.DonationCenterPersonnel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "donation_centers")
public class DonationCenter extends RealLocation {

    @OneToMany(mappedBy = "donationCenter", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<DonationCenterPersonnel> donationCenterPersonnelSet = new HashSet<>();

    @OneToMany(mappedBy = "donationCenter", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Donation> donations = new HashSet<>();

    @OneToMany(mappedBy = "donationCenter", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<DonationBooking> donationBookings = new HashSet<>();

    @OneToMany(mappedBy = "acceptingDonationCenter", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<DonationRequest> acceptedDonationRequests = new HashSet<>();

    @OneToMany(mappedBy = "donationCenter", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<StoredBlood> storedBloodSet = new HashSet<>();
}

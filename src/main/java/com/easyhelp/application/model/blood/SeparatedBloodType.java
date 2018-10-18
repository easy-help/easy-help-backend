package com.easyhelp.application.model.blood;

import com.easyhelp.application.model.BaseEntity;
import com.easyhelp.application.model.requests.DonationRequest;
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
@Table(name = "separated_blood_type")
public class SeparatedBloodType extends BaseEntity {

    @OneToMany(mappedBy = "separatedBloodType", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<DonationRequest> donationRequests = new HashSet<>();

    @OneToMany(mappedBy = "separatedBloodType", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<StoredBlood> storedBloodSet = new HashSet<>();

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_blood_type")
    private BloodType bloodType;

    private BloodComponent component;
}

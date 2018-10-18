package com.easyhelp.application.model.blood;

import com.easyhelp.application.model.BaseEntity;
import com.easyhelp.application.model.requests.Patient;
import com.easyhelp.application.model.users.Donor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "blood_type")
public class BloodType extends BaseEntity {

    @OneToMany(mappedBy = "bloodType", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Patient> patients;

    @OneToMany(mappedBy = "bloodType", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Donor> donors;

    @OneToMany(mappedBy = "bloodType", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<SeparatedBloodType> separatedBloodTypes;

    private String groupLetter;
    private Boolean rh;
}

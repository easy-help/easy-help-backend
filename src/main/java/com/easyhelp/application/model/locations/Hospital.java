package com.easyhelp.application.model.locations;

import com.easyhelp.application.model.users.Doctor;
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
@Table(name = "hospitals")
public class Hospital extends RealLocation {

    @OneToMany(mappedBy = "hospital", orphanRemoval = true, cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Doctor> doctors = new HashSet<>();
}

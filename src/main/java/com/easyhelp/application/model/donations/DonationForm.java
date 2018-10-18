package com.easyhelp.application.model.donations;

import com.easyhelp.application.model.BaseEntity;
import com.easyhelp.application.model.users.Donor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Table(name = "donation_forms")
public class DonationForm extends BaseEntity {

    @OneToOne(optional = false)
    @JoinColumn(name = "fk_donor")
    private Donor donor;

    private Boolean generalGoodHealth;
    private Boolean recentLossOfWeight;
    private Boolean recentInexplicableFever;
    private Boolean recentStomatoTreatmentOrVaccine;
    private Boolean currentDrugTreatment;
    private Boolean sexWithHIVOrHepatitisLast12Months;
    private Boolean sexWithPersonWhoInjectsDrugsLast12Months;
    private Boolean sexWithProstituteLast12Months;
    private Boolean sexWithMultiplePartnersLast12Months;
    private Boolean injectedDrugs;
    private Boolean acceptedMoneyOrDrugsForSex;
    private Boolean changedSexPartnerLast6Months;
    private Integer numberOfPartnersLast6Months;
    private Boolean surgeryOrInvestigationsLast12Months;
    private Boolean tattoosOrPiercingsLast12Months;
    private Boolean transfusionLast12Months;
    private Boolean beenPregnant;
    private Date birthDate;
    private Date lastMenstruation;
    private Boolean bornLivedTraveledAbroad;
    private String travelWhere;
    private String travelWhen;
    private Boolean prisonLastYear;
    private Boolean exposedHepatitis;
    private Boolean sufferFromSet1;
    private Boolean sufferFromSet2;
    private Boolean sufferFromSet3;
    private Boolean sufferFromSet4;
    private Boolean sufferFromSet5;
    private Boolean sufferFromSet6;
    private Boolean sufferFromSet7;
    private Boolean smoker;
    private Date lastAlcoholUse;
    private String alcoholDrank;
    private String alcoholQuantity;
    private Boolean beenRefused;
    private Boolean requireAttentionPostDonation;
}

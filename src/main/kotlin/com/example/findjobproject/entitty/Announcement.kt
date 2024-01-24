package com.example.findjobproject.entitty

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.SequenceGenerator
import java.time.LocalDate

@Entity
@SequenceGenerator(
    name = "Announcement_SEQ_Generator",
    sequenceName = "Announcement_SEQ",
    initialValue = 1, // 처음 시작키 시작값 선정
    allocationSize = 1 // 증가값 선정
)
class Announcement (
    @Id
    @GeneratedValue
    val id: Long ,

    val companyName: String,

    val companyGroup: String,

    val jobTitle: String,

    val jobTag: String,

    val region: String,

    val career: String,

    val education: String,

    val date: LocalDate,

    val tag: String,

    val industry : String,

    @ManyToOne
    @JoinColumn(name = "company_id")
    val companyRecruitmentId : Company
){
    override fun toString(): String {
        return "Announcement(id=$id, companyName='$companyName', companyGroup='$companyGroup', jobTitle='$jobTitle', jobTag='$jobTag', region='$region', career='$career', education='$education', date=$date, tag='$tag', industry='$industry', companyRecruitmentId=$companyRecruitmentId)"
    }
}
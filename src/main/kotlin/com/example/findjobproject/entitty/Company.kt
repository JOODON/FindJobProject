package com.example.findjobproject.entitty

import com.example.findjobproject.entitty.Category.SubCategory
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne
import jakarta.persistence.SequenceGenerator
import java.time.LocalDate
import java.util.Date

@Entity
@SequenceGenerator(
    name = "Company_SEQ_Generator"
    , sequenceName = "Company_SEQ"
    , initialValue = 1 //처음 시작키 시작값 선정
    , allocationSize = 1 //증가값 선정
)
class Company(
    @OneToOne
    val category : SubCategory,
    //Sub 카테고리 필터링해서 찾아주는 용도

    @Id
    @GeneratedValue
    val id : Long,

    val name : String,

    val address : String,

    val updateDate : LocalDate,

    @OneToOne
    val condition : Satisfy

) {
    override fun toString(): String {
        return "Company(id=$id, name='$name', address='$address', updateDate=$updateDate, condition=$condition)"
    }
}

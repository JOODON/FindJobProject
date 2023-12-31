package com.example.findjobproject.entitty

import jakarta.persistence.*

@Entity
@SequenceGenerator(
    name = "SubCategory_SEQ_Generator"
    , sequenceName = "SubCategory_SEQ"
    , initialValue = 1 //처음 시작키 시작값 선정
    , allocationSize = 1 //증가값 선정
)
class SubCategory(
    @Id
    @GeneratedValue
    private val id : Long,

    private val typeOfBusiness: String,

    @ManyToOne
    @JoinColumn(name = "Major_Category_Id")
    private val relatedMaJorCategory : MajorCategory

) {
    override fun toString(): String {
        return "SubCategory(id=$id, typeOfBusiness='$typeOfBusiness', relatedMaJorCategory=$relatedMaJorCategory)"
    }
}

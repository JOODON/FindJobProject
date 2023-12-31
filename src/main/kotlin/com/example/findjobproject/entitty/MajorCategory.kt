package com.example.findjobproject.entitty

import com.example.findjobproject.entitty.MainCategory
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.SequenceGenerator


@Entity
@SequenceGenerator(
    name = "MajorCategory_SEQ_Generator"
    , sequenceName = "MajorCategory_SEQ"
    , initialValue = 1 //처음 시작키 시작값 선정
    , allocationSize = 1 //증가값 선정
)
class MajorCategory(

    @Id
    @GeneratedValue
    private val id : Long,

    private val typeOfBusiness: String,

    @ManyToOne
    @JoinColumn(name = "Main_Category_Id")
    private val relatedMainCategory : MainCategory


) {
    override fun toString(): String {
        return "MajorCategory(id=$id, typeOfBusiness='$typeOfBusiness', relatedMainCategory=$relatedMainCategory)"
    }
}
package com.example.findjobproject.entitty

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.SequenceGenerator


@Entity
@SequenceGenerator (
    name = "MainCategory_SEQ_Generator"
    , sequenceName = "MainCategory_SEQ"
    , initialValue = 1 //처음 시작키 시작값 선정
    , allocationSize = 1 //증가값 선정
)
class MainCategory(

    @Id @GeneratedValue
    private val id : Long,

    private val typeOfBusinessCode: String,

    private val typeOfBusiness: String


) {
    override fun toString(): String {
        return "MainCategory(id=$id, typeOfBusinessCode='$typeOfBusinessCode', typeOfBusiness='$typeOfBusiness')"
    }
}


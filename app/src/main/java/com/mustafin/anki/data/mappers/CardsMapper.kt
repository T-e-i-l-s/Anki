package com.mustafin.anki.data.mappers

import com.mustafin.anki.data.source.local.cardsDao.CardsEntity
import com.mustafin.anki.utils.card.CardModel

fun CardsEntity.toCardModel() = CardModel(
    this.id,
    this.side1,
    this.side2,
    this.deckId
)

fun List<CardsEntity>.toCardModelList(): List<CardModel> {
    return this.map { it.toCardModel() }
}

fun CardModel.toCardsEntity() = CardsEntity(
    this.id,
    this.side1,
    this.side2,
    this.deckId
)
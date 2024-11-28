package com.mustafin.anki.data.mappers

import com.mustafin.anki.data.source.local.decksDao.DecksEntity
import com.mustafin.anki.utils.deck.DeckModel

fun DecksEntity.toDeckModel() = DeckModel(
    this.id,
    this.name
)

fun List<DecksEntity>.toDeckModelList(): List<DeckModel> {
    return this.map { it.toDeckModel() }
}
package com.mhendrif.jetheroes.data

import com.mhendrif.jetheroes.model.Hero
import com.mhendrif.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }
}
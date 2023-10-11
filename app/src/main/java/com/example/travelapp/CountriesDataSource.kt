package com.example.travelapp

class CountriesDataSource {
    companion object{

        fun createCountriesList(): ArrayList<Country> {
            val countriesList =ArrayList<Country>()
            countriesList.add(
                Country(
                    name = "egypt",
                    city = "Cairo",
                    numberOfDays = "5 Days",
                    price = "LE 2000",
                    image = R.drawable.egypt,
                    imageBackground = R.drawable.egypt,
                    rating = 4,
                )

            )
            countriesList.add(
                Country(
                    name = "palatine",
                    city = "Jerusalem",
                    numberOfDays = "5 Days",
                    price = "Shekel 2000",
                    image = R.drawable.palestine,
                    imageBackground = R.drawable.palestine,
                    rating = 4,
                )
            )

            countriesList.add(
                Country(
                    name = "italy",
                    city = "Rome",
                    numberOfDays = "5 Days",
                    price = "€ 2000",
                    image = R.drawable.italy,
                    imageBackground = R.drawable.italy,
                    rating = 4,
                )
            )
            countriesList.add(
                Country(
                    name = "america",
                    city = "Washington ",
                    numberOfDays = "5 Days",
                    price = "$ 2000",
                    image = R.drawable.america,
                    imageBackground = R.drawable.america,
                    rating = 4,
                )
            )
            countriesList.add(
                Country(
                    name = "russia",
                    city = "Moscow ",
                    numberOfDays = "5 Days",
                    price = "RUB 2000",
                    image = R.drawable.russia,
                    imageBackground = R.drawable.russia,
                    rating = 4,
                )
            )
            return countriesList
        }            
        }
    }

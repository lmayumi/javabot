package javabot.operations.time;

public enum Country {
    AFGHANISTAN( "Afghanistan", "AF", "Asia/Kabul" ),
    ALBANIA( "Albania", "AL", "Europe/Tirane" ),
    ALGERIA( "Algeria", "DZ", "Africa/Algiers" ),
    AMERICAN_SAMOA( "American Samoa", "AS", "Pacific/Pago_Pago" ),
    ANDORRA( "Andorra", "AD", "Europe/Andorra" ),
    ANGOLA( "Angola", "AO", "Africa/Luanda" ),
    ANGUILLA( "Anguilla", "AI", "America/Anguilla" ),
    ANTARCTICA( "Antarctica", "AQ", new TimezonesAntarctica( ) ),
    ANTIGUA_AND_BARBUDA( "Antigua and Barbuda", "AG", "America/Antigua" ),
    ARGENTINA( "Argentina", "AR", "America/Argentina/Buenos_Aires" ),
    ARMENIA( "Armenia", "AM", "Asia/Yerevan" ),
    ARUBA( "Aruba", "AW", "America/Aruba" ),
    AUSTRALIA( "Australia", "AU", new TimezonesAustralia( ) ),
    AUSTRIA( "Austria", "AT", "Europe/Vienna" ),
    AZERBAIJAN( "Azerbaijan", "AZ", "Asia/Baku" ),
    BAHAMAS( "Bahamas", "BS", "America/Nassau" ),
    BAHRAIN( "Bahrain", "BH", "Asia/Bahrain" ),
    BANGLADESH( "Bangladesh", "BD", "Asia/Dhaka" ),
    BARBADOS( "Barbados", "BB", "America/Barbados" ),
    BELARUS( "Belarus", "BY", "Europe/Minsk" ),
    BELGIUM( "Belgium", "BE", "Europe/Brussels" ),
    BELIZE( "Belize", "BZ", "America/Belize" ),
    BENIN( "Benin", "BJ", "Africa/Porto-Novo" ),
    BERMUDA( "Bermuda", "BM", "Atlantic/Bermuda" ),
    BHUTAN( "Bhutan", "BT", "Asia/Thimphu" ),
    BOLIVIA( "Bolivia", "BO", "America/La_Paz" ),
    BOSNIA_AND_HERZEGOVINA( "Bosnia and Herzegovina", "BA", "Europe/Belgrade" ),
    BOTSWANA( "Botswana", "BW", "Africa/Gaborone" ),
    BRAZIL( "Brazil", "BR", new TimezonesBrazil( ) ),
    BRITISH_INDIAN_OCEAN_TERRITORY( "British Indian Ocean Territory", "IO", "Indian/Chagos" ),
    BRUNEI( "Brunei", "BN", "Asia/Brunei" ),
    BULGARIA( "Bulgaria", "BG", "Europe/Sofia" ),
    BURKINA_FASO( "Burkina Faso", "BF", "Africa/Ouagadougou" ),
    BURUNDI( "Burundi", "BI", "Africa/Bujumbura" ),
    CAMBODIA( "Cambodia", "KH", "Asia/Phnom_Penh" ),
    CAMEROON( "Cameroon", "CM", "Africa/Douala" ),
    CANADA( "Canada", "CA", new TimezonesCanada( ) ),
    CAPE_VERDE( "Cape Verde", "CV", "Atlantic/Cape_Verde" ),
    CAYMAN_ISLANDS( "Cayman Islands", "KY", "America/Cayman" ),
    CENTRAL_AFRICAN_REPUBLIC( "Central African Republic", "CF", "Africa/Bangui" ),
    CHAD( "Chad", "TD", "Africa/Ndjamena" ),
    CHILE( "Chile", "CL", new TimezonesChile( ) ),
    CHINA( "China", "CN", "Asia/Shanghai" ),
    CHRISTMAS_ISLAND( "Christmas Island", "CX", "Indian/Christmas" ),
    COCOS_ISLANDS( "Cocos Islands", "CC", "Indian/Cocos" ),
    COLOMBIA( "Colombia", "CO", "America/Bogota" ),
    COMOROS( "Comoros", "KM", "Indian/Comoro" ),
    CONGO( "Congo", "CG", new TimezonesCongo( ) ),
    DEMOCRATIC_REPUBLIC_OF_THE_CONGO( "Congo, Democratic Republic of the", "CD", "Africa/Brazzaville" ),
    COOK_ISLANDS( "Cook Islands", "CK", "Pacific/Rarotonga" ),
    COSTA_RICA( "Costa Rica", "CR", "America/Costa_Rica" ),
    COTE_dIVOIRE( "Côte d'Ivoire", "CI", "Africa/Abidjan" ),
    CROATIA( "Croatia", "HR", "Europe/Belgrade" ),
    CUBA( "Cuba", "CU", "America/Havana" ),
    CYPRUS( "Cyprus", "CY", "Asia/Nicosia" ),
    CZECH_REPUBLIC( "Czech Republic", "CZ", "Europe/Prague" ),
    DENMARK( "Denmark", "DK", "Europe/Copenhagen" ),
    DJIBOUTI( "Djibouti", "DJ", "Africa/Djibouti" ),
    DOMINICA( "Dominica", "DM", "America/Dominica" ),
    DOMINICAN_REPUBLIC( "Dominican Republic", "DO", "America/Santo_Domingo" ),
    ECUADOR( "Ecuador", "EC", new TimezonesEcuador( ) ),
    EGYPT( "Egypt", "EG", "Africa/Cairo" ),
    EL_SLAVADOR( "El Salvador", "SV", "America/El_Salvador" ),
    EQUATORIAL_GUINEA( "Equatorial Guinea", "GQ", "Africa/Malabo" ),
    ERITREA( "Eritrea", "ER", "Africa/Asmara" ),
    ESTONIA( "Estonia", "EE", "Europe/Tallinn" ),
    ETHIOPIA( "Ethiopia", "ET", "Africa/Addis_Ababa" ),
    FALKLAND_ISLANDS( "Falkland Islands", "FK", "Atlantic/Stanley" ),
    FAROE_ISLANDS( "Faroe Islands", "FO", "Atlantic/Faroe" ),
    FIJI( "Fiji", "FJ", "Pacific/Fiji" ),
    FINLAND( "Finland", "FI", "Europe/Helsinki" ),
    FRANCE( "France", "FR", "Europe/Paris" ),
    FRENCH_GUIANA( "French Guiana", "GF", "America/Cayenne" ),
    FRENCH_SOUTHERN_TERRITORIES( "French Southern Territories", "TF", "Indian/Kerguelen" ),
    GAMBIA( "Gambia", "GM", "Africa/Banjul" ),
    GEORGIA( "Georgia", "GE", "Asia/Tbilisi" ),
    GERMANY( "Germany", "DE", "Europe/Berlin" ),
    GHANA( "Ghana", "GH", "Africa/Accra" ),
    GIBRALTAR( "Gibraltar", "GI", "Europe/Gibraltar" ),
    GREECE( "Greece", "GR", "Europe/Athens" ),
    GREENLAND( "Greenland", "GL", new TimezonesGreenland( ) ),
    GRENDA( "Grenda", "GD", "America/Grenada" ),
    GUADELOUPE( "Guadeloupe", "GP", "America/Guadeloupe" ),
    GUAM( "Guam", "GU", "Pacific/Guam" ),
    GUATEMALA( "Guatemala", "GT", "America/Guatemala" ),
    GUINEA( "Guinea", "GN",  "Africa/Conakry" ),
    GUINEA_BISSAU( "Guinea-Bissau", "GW", "Africa/Bissau" ),
    GUYANA( "Guyana", "GY", "America/Guyana" ),
    HONDURAS( "Honduras", "HN", "America/Tegucigalpa" ),
    HONG_KONG( "Hong Kong", "HK", "Asia/Hong_Kong" ),
    HUNGARY( "Hungary", "HU", "America/Tegucigalpa" ),
    ICELAND( "Iceland", "IS", "Atlantic/Reykjavik" ),
    INDIA( "India", "IN", "Asia/Calcutta" ),
    INDONESIA( "Indonesia", "ID", new TimezonesIndonesia( ) ),
    IRAN( "Iran", "IR", "Asia/Tehran" ),
    IRAQ( "Iraq", "IQ", "Asia/Baghdad" ),
    IRELAND( "Ireland", "IE", "Europe/Dublin" ),
    ISRAEL( "Israel", "IL", "Asia/Jerusalem" ),
    ITALY( "Italy", "IT", "Europe/Rome" ),
    JAMAICA( "Jamaica", "JM", "America/Jamaica" ),
    JAPAN( "Japan", "JP", "Asia/Tokyo" ),
    JORDAN( "Jordan", "JO", "Asia/Amman" ),
    KAZAKHSTAN( "Kazakhstan", "KZ", "Asia/Bishkek" ),
    KENYA( "Kenya", "KE", "Africa/Nairobi" ),
    KUWAIT( "Kuwait", "KW", "Asia/Kuwait" ),
    KYRGYZSTAN( "Kyrgyzstan", "KG", "Asia/Bishkek" ),
    LAOS( "Laos", "LA", "Asia/Vientiane" ),
    LATVIA( "Latvia", "LV", "Europe/Riga" ),
    LEBANON( "Lebanon", "LB", "Asia/Beirut" ),
    LESOTHO( "Lesotho", "LS", "Africa/Maseru" ),
    LIBERIA( "Liberia", "LR", "Africa/Monrovia" ),
    LIBYA( "Libya", "LY", "Africa/Tripoli" ),
    LIECHTENSTEIN( "Liechtenstein", "LI", "Europe/Vaduz" ),
    LITHUANIA( "Lithuania", "LT", "Europe/Vilnius" ),
    LUXEMBOURG( "Luxembourg", "LU", "Europe/Luxembourg" ),
    MACAO( "Macao", "MO", "Asia/Macau" ),
    MACEDONIA( "Macedonia", "MK", "Europe/Belgrade" ),
    MADAGASCAR( "Madagascar", "MG", "Indian/Antananarivo" ),
    MALAWI( "Malawi", "MW", "Africa/Blantyre" ),
    MALAYSIA( "Malaysia", "MY", "Asia/Kuala_Lumpur" ),
    MALDIVES( "Maldives", "MV", "Indian/Maldives" ),
    MALI( "Mali", "ML", "Africa/Bamako" ),
    MALTA( "Malta", "MT", "Europe/Malta" ),
    MARTINIQUE( "Martinique", "MQ", "America/Martinique" ),
    MAURITANIA( "Mauritania", "MR", "Africa/Nouakchott" ),
    MAURITIUS( "Mauritius", "MU", "Indian/Mauritius" ),
    MAYOTTE( "Mayotte", "YT", "Indian/Mayotte" ),
    MEXICO( "Mexico", "MX", new TimezonesMexico( ) ),
    MOLDOVA( "Moldova", "MD", "Europe/Chisinau" ),
    MONACO( "Monaco", "MC", "Europe/Monaco" ),
    MONGOLIA( "Mongolia", "MN", new TimezonesMongolia( ) ),
    MONTSERRAT( "Montserrat", "MS", "America/Montserrat" ),
    MOROCCO( "Morocco", "MA", "Africa/Casablanca" ),
    MOZAMBIQUE( "Mozambique", "MZ", "Africa/Maputo" ),
    MYANMAR( "Myanmar", "MM", "Asia/Rangoon" ),
    NAMIBIA( "Namibia", "NA", "Africa/Windhoek" ),
    NAURU( "Nauru", "NR", "Pacific/Nauru" ),
    NEPAL( "Nepal", "NP", "Asia/Calcutta" ),
    NETHERLANDS( "Netherlands", "NL", "Europe/Amsterdam" ),
    NETHERLANDS_ANTILLES( "Netherlands Antilles", "AN", "America/Curacao" ),
    NEW_CALEDONIA( "New Caledonia", "NC", "Pacific/Noumea" ),
    NEW_ZEALAND( "New Zealand", "NZ", "Pacific/Auckland" ),
    NICARAGUA( "Nicaragua", "NI", "America/Managua" ),
    NIGER( "Niger", "NE", "Africa/Niamey" ),
    NIGERIA( "Nigeria", "NG", "Africa/Lagos" ),
    NIUE( "Niue", "NU", "Pacific/Niue" ),
    NORFOLK_ISLAND( "Norfolk Island", "NF", "Pacific/Norfolk" ),
    NORTHERN_MARIANA_ISLANDS( "Northern Mariana Islands", "MP", "Pacific/Saipan" ),
    NORTH_KOREA( "North Korea", "NK", "Asia/Pyongyang" ),
    NORWAY( "Norway", "NO", "Europe/Oslo" ),
    OMAN( "Oman", "OM", "Asia/Muscat" ),
    PAKISTAN( "Pakistan", "PK", "Asia/Karachi" ),
    PALAU( "Palau", "PW", "Pacific/Palau" ),
    PALESTINIAN_TERRITORIES( "Palestinian Territories", "PS", "Asia/Gaza" ),
    PANAMA( "Panama", "PA", "America/Panama" ),
    PAPUA_NEW_GUINEA( "Papua New Guinea", "PG", "Pacific/Port_Moresby" ),
    PARAGUAY( "Paraguay", "PY", "America/Asuncion" ),
    PERU( "Peru", "PE", "America/Lima" ),
    PHILIPPINES( "Philippines", "PH", "Asia/Manila" ),
    PITCAIRN( "Pitcairn", "PN", "Pacific/Pitcairn" ),
    POLAND( "Poland", "PL", "Europe/Warsaw" ),
    PORTUGAL( "Portugal", "PT", new TimezonesPortugal( ) ),
    PUERTO_RICO( "Puerto Rico", "PR", "America/Puerto_Rico" ),
    QATAR( "Qatar", "QA", "Asia/Qatar" ),
    REUNION( "Reunion", "RE", "Indian/Reunion" ),
    ROMANIA( "Romania", "RO", "Europe/Bucharest" ),
    RUSSIA( "Russia", "RU", new TimezonesRussia( ) ),
    RWANDA( "Rwanda", "RW", "Africa/Kigali" ),
    SAINT_HELENA( "Saint Helena", "SH", "Atlantic/St_Helena" ),
    SAINT_KITTS_AND_NEVIS( "Saint Kitts and Nevis", "KN", "America/St_Kitts" ),
    SAINT_LUCIA( "Saint Lucia", "LC", "America/St_Lucia" ),
    SAINT_PIERRE_AND_MIQUELON( "Saint Pierre and Miquelon", "PM", "America/Miquelon" ),
    SAINT_VINCENT_AND_THE_GRENADINES( "Saint vincent and the Grenadines", "VC", "America/St_Vincent" ),
    SAMOA( "Samoa", "WS", "Pacific/Apia" ),
    SAN_MARINO( "San Marino", "SM", "Europe/Rome" ),
    SAO_TOME_AND_PRINCIPE( "São Tomé and Príncipe", "ST", "Africa/Sao_Tome" ),
    SAUDI_ARABIA( "Saudi Arabia", "SA", "Asia/Riyadh" ),
    SENEGAL( "Senegal", "SN", "Africa/Dakar" ),
    SERBIA_AND_MONTENEGRO( "Serbia and Montenegro", "CS", "Europe/Belgrade" ),
    SEYCHELLES( "Seychelles", "SC", "Indian/Mahe" ),
    SIERRA_LEONE( "Sierra Leone", "SL", "Africa/Freetown" ),
    SINGAPORE( "Singapore", "SG", "Asia/Singapore" ),
    SLOVAKIA( "Slovakia", "SK", "Europe/Prague" ),
    SLOVENIA( "Slovenia", "SI", "Europe/Belgrade" ),
    SOLOMON_ISLANDS( "Solomon Islands", "SB", "Pacific/Guadalcanal" ),
    SOMALIA( "Somalia", "SO", "Africa/Mogadishu" ),
    SOUTH_AFRICA( "South Africa", "ZA", "Africa/Johannesburg" ),
    SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS( "South Georgia and South Sandwich Islands", "GS", "Atlantic/South_Georgia" ),
    SOUTH_KOREA( "South Korea", "KR", "Asia/Seoul" ),
    SPAIN( "Spain", "ES", new TimezonesSpain( ) ),
    SRI_LANKA( "Sri Lanka", "LK", "Asia/Colombo" ),
    SUDAN( "Sudan", "SD", "Africa/Khartoum" ),
    SURINAME( "Suriname", "SR", "America/Paramaribo" ),
    SVALBARD_AND_JAN_MAYEN( "Svalbard and Jan Mayen", "SJ", "Europe/Oslo" ),
    SWAZILAND( "Swaziland", "SZ", "Africa/Mbabane" ),
    SWEDEN( "Sweden", "SE", "Europe/Stockholm" ),
    SWITZERLAND( "Switzerland", "CH", "Europe/Zurich" ),
    SYRIA( "Syria", "SY", "Asia/Damascus" ),
    TAIWAN( "Taiwan", "TW", "Asia/Taipei" ),
    TAJIKISTAN( "Tajikistan", "TJ", "Asia/Dushanbe" ),
    TANZANIA( "Tanzania", "TZ", "Africa/Dar_es_Salaam" ),
    THAILAND( "Thailand", "TH", "Asia/Bangkok" ),
    TIMOR_LESTE( "Timor-Leste", "TL", "Asia/Dili" ),
    TOGO( "Togo", "TG", "Africa/Lome" ),
    TOKELAU( "Tokelau", "TK", "Pacific/Fakaofo" ),
    TONGA( "Tonga", "TO", "Pacific/Tongatapu" ),
    TRINIDAD_AND_TOBAGO( "Trinidad and Tobago", "TT", "America/Port_of_Spain" ),
    TUNISIA( "Tunisia", "TN", "Africa/Tunis" ),
    TURKEY( "Turkey", "TR", "Europe/Istanbul" ),
    TURKMENISTAN( "Turkmenistan", "TM", "Asia/Ashgabat" ),
    TURKS_AND_CAICOS_ISLANDS( "Turks and Caicos Islands", "TC", "America/Grand_Turk" ),
    TUVALU( "Tuvalu", "TV", "Pacific/Funafuti" ),
    UGANDA( "Uganda", "UG", "Africa/Kampala" ),
    UKRAINE( "Ukraine", "UA", "Europe/Kiev" ),
    UNITED_ARAB_EMIRATES( "United Arab Emirates", "AE", "Asia/Dubai" ),
    UNITED_KINGDOM( "United Kingdom", "GB", "Europe/London" ),
    UNITED_STATES( "United States", "US", new TimezonesUS( ) ),
    URUGUAY( "Uruguay", "UY", "America/Montevideo" ),
    UZBEKISTAN( "Uzbekistan", "UZ", "Asia/Tashkent" ),
    VANUATU( "Vanuatu", "VU", "Pacific/Efate" ),
    VATICAN_CITY( "Vatican City", "VA", "Europe/Rome" ),
    VENEZUELA( "Venezuela", "VE", "America/Caracas" ),
    VIETNAM( "Vietnam", "VN", "Asia/Ho_Chi_Minh" ),
    BRITISH_VIRGIN_ISLANDS( "Virgin Islands, British", "VG", "America/Tortola" ),
    US_VIRGIN_ISLANDS( "Virgin Islands, U.S.", "VI", "America/St_Thomas" ),
    WALLIS_AND_FUTUNA( "Wallice and Futuna", "WF", "Pacific/Wallis" ),
    YEMEN( "Yemen", "YE", "Asia/Aden" ),
    ZAMBIA( "Zambia", "ZM", "Africa/Lusaka" ),
    ZIMBABWE( "Zimbabwe", "ZW", "Africa/Harare" ),
    OTHER( "Other", "other", "" );

    private final String name;
    private final String abbreviation;
    private final String timezone;
    private final Timezones multiZones;


    Country( String name, String abbreviation, String timezone ) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.timezone = timezone;
        this.multiZones = null;
    }

    Country( String name, String abbreviation, Timezones multiZones ) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.timezone = null;
        this.multiZones = multiZones;
    }

    public String getTimezone( ) {
        return timezone;
    }

    public Timezones getMultiZones( ) {
        return multiZones;
    }

    public boolean isMultiZones( ) {
        return timezone == null;
    }

    public String getName( ) {
        return name;
    }

    public String getAbbreviation( ) {
        return abbreviation;
    }

    @Override
    public String toString( ) {
        return name;
    }
}


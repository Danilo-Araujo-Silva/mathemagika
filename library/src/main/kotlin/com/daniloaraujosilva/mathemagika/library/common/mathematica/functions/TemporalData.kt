package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             TemporalData
 *
 * Full name:        System`TemporalData
 *
 *                   TemporalData[{v , v , …}, tspec] represents temporal data with values v  at times specified by tspec.
 *                                  1   2                                                   i
 *                   TemporalData[{{v  , v  , …}, {v  , v  , …}, …}, tspec] represents a temporal data collection with values v   at times specified by tspec.
 *                                   11   12        21   22                                                                    ij
 *                   TemporalData[{{t , v }, {t , v } …}] represents temporal data specified by time-value pairs {t , v }.
 *                                   1   1     2   2                                                               i   i
 *                   TemporalData[{{{t  , v  }, {t  , v  } …}, {{t  , v  }, {t  , v  }, …}, …}] represents a temporal data collection given as lists of time-value pairs {t  , v  }.
 * Usage:                             11   11     12   12         21   21     22   22                                                                                      ij   ij
 *
 *                   CalendarType -> Gregorian
 *                   DateFunction -> Automatic
 *                   HolidayCalendar -> {UnitedStates, Default}
 *                   MetaInformation -> None
 *                   MissingDataMethod -> None
 *                   ResamplingMethod -> Automatic
 *                   TemporalRegularity -> Automatic
 *                   TimeZone :> $TimeZone
 * Options:          ValueDimensions -> Automatic
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TemporalData
 * Documentation:    web: http://reference.wolfram.com/language/ref/TemporalData.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun temporalData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TemporalData", arguments.toMutableList(), options)
}

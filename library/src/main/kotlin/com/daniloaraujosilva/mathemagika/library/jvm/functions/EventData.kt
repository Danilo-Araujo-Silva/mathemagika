package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             EventData
 *
 * Full name:        System`EventData
 *
 *                   EventData[{e , e , …}] represents event data with explicitly specified censoring e .
 *                               1   2                                                                 i
 *                   EventData[{e , e , …}, {ci , ci , …}] represents event data e  with censoring indicators ci .
 *                               1   2         1    2                             i                             i
 *                   EventData[{e , e , …}, {cc , cc , …}] represents event data e  with censoring counts cc .
 *                               1   2         1    2                             i                         i
 *                   EventData[{e , e , …}, cspec, {tr , tr , …}] represents event data with censoring and truncation tr .
 * Usage:                        1   2                1    2                                                            i
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/EventData
 * Documentation:    web: http://reference.wolfram.com/language/ref/EventData.html
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
fun eventData(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("EventData", arguments.toMutableList(), options)
}

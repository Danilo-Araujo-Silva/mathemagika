package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 *                    1
 *                   ---
 * Name:             100
 *
 *                                1
 *                   Information[---, FullName]
 * Full name:                    100
 *
 *                                1
 *                   Information[---, Usage]
 * Usage:                        100
 *
 *                                1
 *                   Information[---, Options]
 * Options:                      100
 *
 *                                1
 *                   Information[---, Attributes]
 * Attributes:                   100
 *
 *                                         1
 *                   local: <>Information[---, Documentation][Local]
 *                                        100
 *                                       1
 *                   web: <>Information[---, Documentation][Web]
 * Documentation:                       100
 *
 *                                1
 *                   Information[---, Definitions]
 * Definitions:                  100
 *
 *                                1
 *                   Information[---, OwnValues]
 * Own values:                   100
 *
 *                                1
 *                   Information[---, DownValues]
 * Down values:                  100
 *
 *                                1
 *                   Information[---, UpValues]
 * Up values:                    100
 *
 *                                1
 *                   Information[---, SubValues]
 * Sub values:                   100
 *
 *                                1
 *                   Information[---, DefaultValues]
 * Default value:                100
 *
 *                                1
 *                   Information[---, NValues]
 * Numeric values:               100
 */
fun `$TimeUnit`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$TimeUnit", arguments.toMutableList(), options)
}

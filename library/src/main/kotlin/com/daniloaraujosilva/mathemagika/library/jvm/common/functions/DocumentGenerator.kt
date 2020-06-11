package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DocumentGenerator
 *
 * Full name:        System`DocumentGenerator
 *
 *                   DocumentGenerator[template, timespec] represents a document generator with template template to be evaluated on the schedule defined by timespec.
 * Usage:            DocumentGenerator[template, driver, timespec] takes parameters for filling the template from driver.
 *
 *                   AutoRemove -> False
 *                   DeliveryFunction -> None
 *                   EpilogFunction -> None
 *                   GeneratorDescription -> None
 *                   GeneratorHistoryLength -> Infinity
 *                   GeneratorOutputType -> CloudCDF
 *                   NotificationFunction -> Automatic
 *                   Permissions -> Automatic
 * Options:          TimeZone -> Automatic
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DocumentGenerator
 * Documentation:    web: http://reference.wolfram.com/language/ref/DocumentGenerator.html
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
fun documentGenerator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DocumentGenerator", arguments.toMutableList(), options)
}

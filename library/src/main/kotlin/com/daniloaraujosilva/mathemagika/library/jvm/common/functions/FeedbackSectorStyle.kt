package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FeedbackSectorStyle
 *
 * Full name:        System`FeedbackSectorStyle
 *
 * Usage:            FeedbackSectorStyle is an option to NyquistPlot that specifies the style in which graphics of FeedbackSector should be drawn.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FeedbackSectorStyle
 * Documentation:    web: http://reference.wolfram.com/language/ref/FeedbackSectorStyle.html
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
fun feedbackSectorStyle(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FeedbackSectorStyle", arguments.toMutableList(), options)
}

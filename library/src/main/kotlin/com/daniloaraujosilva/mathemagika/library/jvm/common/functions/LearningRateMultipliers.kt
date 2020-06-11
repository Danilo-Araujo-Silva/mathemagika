package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             LearningRateMultipliers
 *
 * Full name:        System`LearningRateMultipliers
 *
 * Usage:            LearningRateMultipliers is an option for net layers and for NetTrain, NetChain, NetGraph that specifies learning rate multipliers to apply during training.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/LearningRateMultipliers
 * Documentation:    web: http://reference.wolfram.com/language/ref/LearningRateMultipliers.html
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
fun learningRateMultipliers(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LearningRateMultipliers", arguments.toMutableList(), options)
}

package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             NetGANOperator
 *
 * Full name:        System`NetGANOperator
 *
 *                   NetGANOperator[{generator, discriminator}] represents a network to perform Generative Adversarial Network (GAN) training with a generative net generator and a classification net discriminator.
 * Usage:            NetGANOperator[{generator, discriminator}, loss] specifies the loss type to be used.
 *
 *                   GeneratedFake -> Automatic
 *                   Latent -> Automatic
 *                   LearningRateMultipliers -> Automatic
 *                   LossFake -> Automatic
 *                   LossReal -> Automatic
 * Options:          Sample -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/NetGANOperator
 * Documentation:    web: http://reference.wolfram.com/language/ref/NetGANOperator.html
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
fun netGANOperator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NetGANOperator", arguments.toMutableList(), options)
}

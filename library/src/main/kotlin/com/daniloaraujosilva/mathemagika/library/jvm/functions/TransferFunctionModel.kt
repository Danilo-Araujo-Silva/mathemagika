package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TransferFunctionModel
 *
 * Full name:        System`TransferFunctionModel
 *
 *                   TransferFunctionModel[m, s] represents the model of the transfer-function matrix m with complex variable s.
 *                   TransferFunctionModel[{num, den}, s] specifies the numerator num and denominator den of a transfer-function model.
 *                   TransferFunctionModel[{z, p, g}, s] specifies the zeros z, poles p, and gain g of a transfer-function model.
 * Usage:            TransferFunctionModel[sys] gives the transfer-function model of the systems model sys.
 *
 *                   Appearance -> Automatic
 *                   ExternalTypeSignature -> Automatic
 *                   Method -> Automatic
 *                   SamplingPeriod -> Automatic
 * Options:          SystemsModelLabels -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TransferFunctionModel
 * Documentation:    web: http://reference.wolfram.com/language/ref/TransferFunctionModel.html
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
fun transferFunctionModel(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TransferFunctionModel", arguments.toMutableList(), options)
}

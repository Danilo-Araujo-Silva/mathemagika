package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             StateTransformationLinearize
 *
 * Full name:        System`StateTransformationLinearize
 *
 *                   StateTransformationLinearize[asys] linearizes the AffineStateSpaceModel asys by state transformation.
 *                   StateTransformationLinearize[asys, {z, lform}] specifies the new states z and form of linearization lform.
 * Usage:            StateTransformationLinearize[asys, …, "prop"] computes the property "prop".
 *
 * Options:          Method -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/StateTransformationLinearize
 * Documentation:    web: http://reference.wolfram.com/language/ref/StateTransformationLinearize.html
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
fun stateTransformationLinearize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("StateTransformationLinearize", arguments.toMutableList(), options)
}

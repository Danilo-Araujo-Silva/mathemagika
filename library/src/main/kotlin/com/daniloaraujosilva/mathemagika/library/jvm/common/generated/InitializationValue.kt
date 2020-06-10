package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             InitializationValue
 * 
 * Full name:        System`InitializationValue
 * 
 *                   InitializationValue[sym] represents the settable persistent value with which the symbol sym will be initialized.
 *                   InitializationValue["context`name"] represents the settable initialization value for the symbol with the specified complete name.
 *                   InitializationValue[sym, {loc , …}] specifies the persistence locations to search for a possible initialization value.
 * Usage:                                         1
 * 
 *                   EvaluationEnvironment :> $EvaluationEnvironment
 *                   ExpirationDate -> None
 *                   MergingFunction -> Automatic
 *                   PersistenceTime -> None
 * Options:          ValuePreprocessingFunction -> Automatic
 * 
 *                   HoldFirst
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/InitializationValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/InitializationValue.html
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
fun initializationValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InitializationValue", arguments.toMutableList(), options)
}

package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             FormFunction
 *
 * Full name:        System`FormFunction
 *
 *                   FormFunction[formspec, func] represents an active form that, when submitted, applies func to the values obtained from the form specified by formspec.
 *                   FormFunction[{name   type , …}, func] represents an active form with fields named name  interpreted as types type .
 *                                     1       1                                                            i                          i
 *                   FormFunction[{{name , label }  type , …}, func] uses label  as the label for the field named name .
 *                                      1       1        1                      i                                      i
 *                   FormFunction[{namespec   type   default , …}, func] uses default  as the default for the field specified by namespec .
 *                                         1       1          1                        i                                                   i
 *                   FormFunction[formspec, func, fmt] specifies that in the cloud, the result from applying func should be returned in format fmt.
 *                   FormFunction[{formspec , formspec , …}, func, …] represents a multipage form, in which the successive formspec  can be functions that are applied to the values obtained so far.
 * Usage:                                  1          2                                                                            i
 *
 *                   AppearanceRules -> Automatic
 *                   FormLayoutFunction -> Automatic
 *                   ImageFormattingWidth -> Automatic
 *                   ImageSize -> Automatic
 * Options:          PageTheme -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FormFunction
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormFunction.html
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
fun formFunction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormFunction", arguments.toMutableList(), options)
}

package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FormObject
 *
 * Full name:        System`FormObject
 *
 *                   FormObject[{name   type , name   type , …}] represents a form with fields having names name  that take data of type type .
 *                                   1       1      2       2                                                     i                            i
 *                   FormObject[{{name , label }  type , …}] uses label  as the label for the field named name .
 *                                    1       1        1                i                                      i
 *                   FormObject[{name   assoc , …, obj , …}] uses full specification assoc  for a field, and obj  as part of the layout of the form.
 * Usage:                            1        1        j                                   i                     j
 *
 *                   AllowedCloudExtraParameters -> None
 *                   AllowedCloudParameterExtensions -> Automatic
 *                   AppearanceRules -> Automatic
 *                   FormLayoutFunction -> Automatic
 *                   ImageFormattingWidth -> Automatic
 *                   ImageSize -> Automatic
 * Options:          PageTheme -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FormObject
 * Documentation:    web: http://reference.wolfram.com/language/ref/FormObject.html
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
fun formObject(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FormObject", arguments.toMutableList(), options)
}

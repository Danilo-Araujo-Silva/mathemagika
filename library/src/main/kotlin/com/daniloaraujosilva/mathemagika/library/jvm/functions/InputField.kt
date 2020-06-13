package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             InputField
 *
 * Full name:        System`InputField
 *
 *                   InputField[] represents a blank editable input field.
 *                   InputField[x] represents an editable input field that currently contains the expression x.
 *                   InputField[Dynamic[x]] takes the contents of the input field to be the dynamically updated current value of x, with the value of x being reset if new contents are entered.
 *                   InputField[x, String] represents an input field whose contents are taken to be a string.
 *                   InputField[x, Number] represents an input field whose contents are taken to be a number.
 * Usage:            InputField[x, type] represents an input field whose contents are taken to be of the specified type.
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   Appearance -> Automatic
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> False
 *                   DefaultBaseStyle -> InputField
 *                   DefaultFieldHintStyle -> FieldHintStyle
 *                   Enabled -> Automatic
 *                   FieldCompletionFunction -> Automatic
 *                   FieldHint -> Null
 *                   FieldHintStyle -> {}
 *                   FieldMasked -> False
 *                   FieldSize -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> Automatic
 *                   ImageSize -> Automatic
 *                   MenuList -> {}
 * Options:          Method -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/InputField
 * Documentation:    web: http://reference.wolfram.com/language/ref/InputField.html
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
fun inputField(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("InputField", arguments.toMutableList(), options)
}

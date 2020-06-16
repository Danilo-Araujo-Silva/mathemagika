package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             MailItem
 *
 * Full name:        System`MailItem
 *
 * Usage:            MailItem[…] represents an item of mail associated with an active mail server connection.
 *
 * Options:          None
 *
 * Attributes:
 *
 *                   local: paclet:ref/MailItem
 * Documentation:    web: http://reference.wolfram.com/language/ref/MailItem.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 *                   MailItem[(MailLink`Private`data_)?AssociationQ]["Flags"] := MailExecute["Flags", MailItem[MailLink`Private`data]]
 *                   MailItem[(MailLink`Private`data_)?AssociationQ]["Tags"] := MailExecute["Tags", MailItem[MailLink`Private`data]]
 *                   MailItem[(MailLink`Private`data_)?AssociationQ][MailLink`Private`key_String] /; KeyExistsQ[MailLink`Private`data, MailLink`Private`key] := MailLink`Private`data[MailLink`Private`key]
 *                   MailItem[(MailLink`Private`data_)?AssociationQ]["Properties"] := Union[Keys[MailLink`Private`data], Import[Lookup[MailLink`Private`data, "EMLFile"], "Elements"], {"Flags", "Tags"}]
 * Sub values:       MailItem[(MailLink`Private`data_)?AssociationQ][MailLink`Private`key_String] := Import[Lookup[MailLink`Private`data, "EMLFile"], MailLink`Private`key]
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun mailItem(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MailItem", arguments.toMutableList(), options)
}

package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             NondimensionalizationTransform
 * 
 * Full name:        System`NondimensionalizationTransform
 * 
 *                   NondimensionalizationTransform[eq, ovars, fvars] nondimensionalizes eq, replacing original variables ovars with the variables fvars.
 * Usage:            NondimensionalizationTransform[eq, ovars, fvars, prop] returns a property associated with the nondimensionalization of eq.
 * 
 *                   GeneratedParameters -> C
 *                   GeneratedQuantityMagnitudes -> K
 *                   IncludeQuantities -> {}
 * Options:          UnitSystem -> Automatic
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/NondimensionalizationTransform
 * Documentation:    web: http://reference.wolfram.com/language/ref/NondimensionalizationTransform.html
 * 
 *                   NondimensionalizationTransform["Properties"] := Sort[{"PropertyAssociation", "ReducedForm", "NondimensionalizationRules", "DimensionalizationRules", "NondimensionalizationMultipliers", "DimensionalizationMultipliers"}]
 *                   NondimensionalizationTransform[QuantityUnits`Private`equ_, QuantityUnits`Private`vinitial_, QuantityUnits`Private`vfinal_, QuantityUnits`Private`opts:OptionsPattern[]] := With[{QuantityUnits`Private`res = QuantityUnits`Private`iNondimensionalize[QuantityUnits`Private`equ, QuantityUnits`Private`vinitial, QuantityUnits`Private`vfinal, "ReducedForm", OptionValue[IncludeQuantities], OptionValue[GeneratedParameters], OptionValue[GeneratedQuantityMagnitudes], OptionValue[UnitSystem]]}, QuantityUnits`Private`res /; QuantityUnits`Private`res =!= $Failed]
 * Definitions:      NondimensionalizationTransform[QuantityUnits`Private`equ_, QuantityUnits`Private`vinitial_, QuantityUnits`Private`vfinal_, QuantityUnits`Private`prop_, QuantityUnits`Private`opts:OptionsPattern[]] := With[{QuantityUnits`Private`res = QuantityUnits`Private`iNondimensionalize[QuantityUnits`Private`equ, QuantityUnits`Private`vinitial, QuantityUnits`Private`vfinal, QuantityUnits`Private`prop, OptionValue[IncludeQuantities], OptionValue[GeneratedParameters], OptionValue[GeneratedQuantityMagnitudes], OptionValue[UnitSystem]]}, QuantityUnits`Private`res /; QuantityUnits`Private`res =!= $Failed]
 * 
 * Own values:       None
 * 
 *                   NondimensionalizationTransform["Properties"] := Sort[{"PropertyAssociation", "ReducedForm", "NondimensionalizationRules", "DimensionalizationRules", "NondimensionalizationMultipliers", "DimensionalizationMultipliers"}]
 *                   NondimensionalizationTransform[QuantityUnits`Private`equ_, QuantityUnits`Private`vinitial_, QuantityUnits`Private`vfinal_, QuantityUnits`Private`opts:OptionsPattern[]] := With[{QuantityUnits`Private`res = QuantityUnits`Private`iNondimensionalize[QuantityUnits`Private`equ, QuantityUnits`Private`vinitial, QuantityUnits`Private`vfinal, "ReducedForm", OptionValue[IncludeQuantities], OptionValue[GeneratedParameters], OptionValue[GeneratedQuantityMagnitudes], OptionValue[UnitSystem]]}, QuantityUnits`Private`res /; QuantityUnits`Private`res =!= $Failed]
 * Down values:      NondimensionalizationTransform[QuantityUnits`Private`equ_, QuantityUnits`Private`vinitial_, QuantityUnits`Private`vfinal_, QuantityUnits`Private`prop_, QuantityUnits`Private`opts:OptionsPattern[]] := With[{QuantityUnits`Private`res = QuantityUnits`Private`iNondimensionalize[QuantityUnits`Private`equ, QuantityUnits`Private`vinitial, QuantityUnits`Private`vfinal, QuantityUnits`Private`prop, OptionValue[IncludeQuantities], OptionValue[GeneratedParameters], OptionValue[GeneratedQuantityMagnitudes], OptionValue[UnitSystem]]}, QuantityUnits`Private`res /; QuantityUnits`Private`res =!= $Failed]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun nondimensionalizationTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("NondimensionalizationTransform", arguments.toMutableList(), options)
}

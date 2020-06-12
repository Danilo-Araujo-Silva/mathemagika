package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TravelDirections
 *
 * Full name:        System`TravelDirections
 *
 *                   TravelDirections[{loc , loc , …}] generates directions for travel from loc  to loc , ….
 *                                        1     2                                              1       2
 *                   TravelDirections[{loc , loc , …}, "prop"] gives the property prop of travel directions.
 * Usage:                                 1     2
 *
 *                   TravelMethod -> Driving
 * Options:          UnitSystem :> $UnitSystem
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/TravelDirections
 * Documentation:    web: http://reference.wolfram.com/language/ref/TravelDirections.html
 *
 *                   TravelDirections[GIS`TravelDump`locations:{(_String | _Entity | _GeoPosition)..}, GIS`TravelDump`opts:OptionsPattern[]] := GIS`TravelDump`callGetDirections[TravelDirections, GIS`TravelDump`locations, {GIS`TravelDump`opts}] /. GIS`TravelDump`res_Association :> TravelDirectionsData[GIS`TravelDump`locations, GIS`TravelDump`res, GIS`TravelDump`opts]
 *                   TravelDirections[GIS`TravelDump`arg_, OptionsPattern[]] := $Failed /; (Switch[GIS`TravelDump`arg, {_, __}, Message[TravelDirections::arginvll, GIS`TravelDump`arg], _, Message[TravelDirections::arginvlt, GIS`TravelDump`arg]]; False)
 *                   TravelDirections[GIS`TravelDump`args___] := $Failed /; (System`Private`Arguments[TravelDirections[GIS`TravelDump`args], {1, 2}, List, {GIS`TravelDump`args} /. {{_, "TravelDistance", ___} :> Options[TravelDirectionsData], _ -> {}}]; False)
 *                   TravelDirections[GIS`TravelDump`locations:{(_String | _Entity | _GeoPosition)..}, GIS`TravelDump`property_, GIS`TravelDump`opts:OptionsPattern[TravelDirections] | OptionsPattern[TravelDirectionsData]] := TravelDirections[GIS`TravelDump`locations, FilterRules[{GIS`TravelDump`opts}, Options[TravelDirections]]] /. GIS`TravelDump`directions_TravelDirectionsData :> GIS`TravelDump`directions[GIS`TravelDump`property, Sequence @@ FilterRules[{GIS`TravelDump`opts}, Options[TravelDirectionsData]]]
 * Definitions:      TravelDirections[GIS`TravelDump`locations_, GIS`TravelDump`property_, OptionsPattern[]] := $Failed /; (Switch[GIS`TravelDump`locations, {_, __}, Message[TravelDirections::arginvll, GIS`TravelDump`locations], _, Message[TravelDirections::arginvlt, GIS`TravelDump`locations]]; False)
 *
 * Own values:       None
 *
 *                   TravelDirections[GIS`TravelDump`locations:{(_String | _Entity | _GeoPosition)..}, GIS`TravelDump`opts:OptionsPattern[]] := GIS`TravelDump`callGetDirections[TravelDirections, GIS`TravelDump`locations, {GIS`TravelDump`opts}] /. GIS`TravelDump`res_Association :> TravelDirectionsData[GIS`TravelDump`locations, GIS`TravelDump`res, GIS`TravelDump`opts]
 *                   TravelDirections[GIS`TravelDump`arg_, OptionsPattern[]] := $Failed /; (Switch[GIS`TravelDump`arg, {_, __}, Message[TravelDirections::arginvll, GIS`TravelDump`arg], _, Message[TravelDirections::arginvlt, GIS`TravelDump`arg]]; False)
 *                   TravelDirections[GIS`TravelDump`args___] := $Failed /; (System`Private`Arguments[TravelDirections[GIS`TravelDump`args], {1, 2}, List, {GIS`TravelDump`args} /. {{_, "TravelDistance", ___} :> Options[TravelDirectionsData], _ -> {}}]; False)
 *                   TravelDirections[GIS`TravelDump`locations:{(_String | _Entity | _GeoPosition)..}, GIS`TravelDump`property_, GIS`TravelDump`opts:OptionsPattern[TravelDirections] | OptionsPattern[TravelDirectionsData]] := TravelDirections[GIS`TravelDump`locations, FilterRules[{GIS`TravelDump`opts}, Options[TravelDirections]]] /. GIS`TravelDump`directions_TravelDirectionsData :> GIS`TravelDump`directions[GIS`TravelDump`property, Sequence @@ FilterRules[{GIS`TravelDump`opts}, Options[TravelDirectionsData]]]
 * Down values:      TravelDirections[GIS`TravelDump`locations_, GIS`TravelDump`property_, OptionsPattern[]] := $Failed /; (Switch[GIS`TravelDump`locations, {_, __}, Message[TravelDirections::arginvll, GIS`TravelDump`locations], _, Message[TravelDirections::arginvlt, GIS`TravelDump`locations]]; False)
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun travelDirections(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TravelDirections", arguments.toMutableList(), options)
}

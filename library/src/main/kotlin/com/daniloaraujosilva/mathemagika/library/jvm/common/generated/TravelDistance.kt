package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TravelDistance
 * 
 * Full name:        System`TravelDistance
 * 
 *                   TravelDistance[{loc , loc , …}] gives the estimated distance for travel from loc  to loc , ….
 * Usage:                               1     2                                                      1       2
 * 
 *                   TravelMethod -> Driving
 * Options:          UnitSystem :> $UnitSystem
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/TravelDistance
 * Documentation:    web: http://reference.wolfram.com/language/ref/TravelDistance.html
 * 
 *                   TravelDistance[GIS`TravelDump`locations:{(_String | _Entity | _GeoPosition)..}, GIS`TravelDump`opts:OptionsPattern[]] := Replace[GIS`TravelDump`travelDirectionsInternal[TravelDistance, GIS`TravelDump`locations, GIS`TravelDump`opts], GIS`TravelDump`td_TravelDirectionsData :> GIS`TravelDump`td["TravelDistance"]]
 *                   TravelDistance[GIS`TravelDump`arg_, GIS`TravelDump`opts:OptionsPattern[]] := $Failed /; (Switch[GIS`TravelDump`arg, {_, __}, Message[TravelDistance::arginvll, GIS`TravelDump`arg], _, Message[TravelDistance::arginvlt, GIS`TravelDump`arg]]; False)
 *                   TravelDistance[GIS`TravelDump`loc1:_String | _Entity | _GeoPosition, GIS`TravelDump`loc2:_String | _Entity | _GeoPosition, GIS`TravelDump`opts:OptionsPattern[]] := TravelDistance[{GIS`TravelDump`loc1, GIS`TravelDump`loc2}, GIS`TravelDump`opts]
 *                   TravelDistance[GIS`TravelDump`arg1:_String | _Entity | _GeoPosition, GIS`TravelDump`arg2_, GIS`TravelDump`opts:OptionsPattern[]] := $Failed /; (Message[TravelDistance::arginv, GIS`TravelDump`arg2]; False)
 *                   TravelDistance[GIS`TravelDump`arg1:Except[_String | _Entity | _GeoPosition], GIS`TravelDump`arg2_, GIS`TravelDump`opts:OptionsPattern[]] := $Failed /; (Message[TravelDistance::arginv, GIS`TravelDump`arg1]; False)
 * Definitions:      TravelDistance[GIS`TravelDump`args___] := $Failed /; (System`Private`Arguments[TravelDistance[GIS`TravelDump`args], {1, 2}]; False)
 * 
 * Own values:       None
 * 
 *                   TravelDistance[GIS`TravelDump`locations:{(_String | _Entity | _GeoPosition)..}, GIS`TravelDump`opts:OptionsPattern[]] := Replace[GIS`TravelDump`travelDirectionsInternal[TravelDistance, GIS`TravelDump`locations, GIS`TravelDump`opts], GIS`TravelDump`td_TravelDirectionsData :> GIS`TravelDump`td["TravelDistance"]]
 *                   TravelDistance[GIS`TravelDump`arg_, GIS`TravelDump`opts:OptionsPattern[]] := $Failed /; (Switch[GIS`TravelDump`arg, {_, __}, Message[TravelDistance::arginvll, GIS`TravelDump`arg], _, Message[TravelDistance::arginvlt, GIS`TravelDump`arg]]; False)
 *                   TravelDistance[GIS`TravelDump`loc1:_String | _Entity | _GeoPosition, GIS`TravelDump`loc2:_String | _Entity | _GeoPosition, GIS`TravelDump`opts:OptionsPattern[]] := TravelDistance[{GIS`TravelDump`loc1, GIS`TravelDump`loc2}, GIS`TravelDump`opts]
 *                   TravelDistance[GIS`TravelDump`arg1:_String | _Entity | _GeoPosition, GIS`TravelDump`arg2_, GIS`TravelDump`opts:OptionsPattern[]] := $Failed /; (Message[TravelDistance::arginv, GIS`TravelDump`arg2]; False)
 *                   TravelDistance[GIS`TravelDump`arg1:Except[_String | _Entity | _GeoPosition], GIS`TravelDump`arg2_, GIS`TravelDump`opts:OptionsPattern[]] := $Failed /; (Message[TravelDistance::arginv, GIS`TravelDump`arg1]; False)
 * Down values:      TravelDistance[GIS`TravelDump`args___] := $Failed /; (System`Private`Arguments[TravelDistance[GIS`TravelDump`args], {1, 2}]; False)
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun travelDistance(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TravelDistance", arguments.toMutableList(), options)
}
